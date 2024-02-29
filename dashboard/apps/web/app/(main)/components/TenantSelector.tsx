"use client";
import { FC } from "react";
import { useTenant } from "../../../contexts/TenantContext";

export const TenantSelector: FC = () => {
  const { tenants } = useTenant();
  return (
    <div className="flex">
      <div className="flex-shrink-0 z-10 inline-flex items-center py-2.5 px-4 text-sm font-medium text-center text-gray-100 bg-zinc-800 border border-gray-700 rounded-s-lg hover:bg-gray-200 focus:ring-4 focus:outline-none focus:ring-gray-100 dark:bg-gray-700 dark:hover:bg-gray-600 dark:focus:ring-gray-700 dark:text-white dark:border-gray-600">
        Tenant
      </div>
      <select className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-e-lg border-s-gray-100 dark:border-s-gray-700 border-s-2 focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500">
        {tenants.map((tenant) => (
          <option className="text-right" key={tenant}>
            {tenant}
          </option>
        ))}
      </select>
    </div>
  );
};
