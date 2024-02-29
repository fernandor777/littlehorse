"use client";
import {
  FC,
  PropsWithChildren,
  createContext,
  useCallback,
  useContext,
  useEffect,
  useState,
} from "react";
import getTenants from "./getTenants";

type Tenant = {
  currentTenant: string | null;
  tenants: string[];
  setCurrentTenant: (tenantId: string) => void;
};

const TenantContext = createContext<Tenant>({
  currentTenant: "default",
  tenants: [],
  setCurrentTenant: () => {},
});

export const TenantContextProvider: FC<PropsWithChildren> = ({ children }) => {
  const [currentTenant, setTenantInternal] = useState<string|null>(null);
  const [tenants, setTenants] = useState<string[]>([]);

  const setCurrentTenant = (tenantId: string) => {
    setTenantInternal(tenantId);
  };

  const refreshTenants = useCallback(async () => {
    const response = await getTenants();
    setTenants(response);
    if (response.length > 0) {
      setTenantInternal(response[0]);
    }
  }, []);

  useEffect(() => {
    refreshTenants();
  }, []);

  return (
    <TenantContext.Provider
      value={{ currentTenant, tenants, setCurrentTenant }}
    >
      {children}
    </TenantContext.Provider>
  );
};

export const useTenant = () => {
  const context = useContext(TenantContext);
  return context;
};
