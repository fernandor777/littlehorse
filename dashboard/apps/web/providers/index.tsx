import { SessionProvider } from "../components/SessionProvider";
import FeatureToggleProvider from "../contexts/FeatureToggleContext";
import React from "react";
import { CheckSession } from "../components/CheckSession";
import { TenantContextProvider } from "../contexts/TenantContext";

interface CheckSessionProps {
  children?: React.ReactNode;
}
export function Providers({ children }: CheckSessionProps) {
  const toggles = {
    isAuthenticationEnabled: process.env.LHD_OAUTH_ENABLED,
  };

  return (
    <FeatureToggleProvider value={toggles}>
      <SessionProvider>
        <TenantContextProvider>
          <CheckSession>{children}</CheckSession>
        </TenantContextProvider>
      </SessionProvider>
    </FeatureToggleProvider>
  );
}
