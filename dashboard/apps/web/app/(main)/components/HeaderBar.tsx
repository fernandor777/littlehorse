import Image from "next/image";
import { HeaderBar as Header } from "ui";
import Link from "next/link";
import { LoginDropdown } from "./LoginDropdown";
import { FC } from "react";
import { TenantSelector } from "./TenantSelector";

export const HeaderBar: FC = () => {
  return (
    <Header>
      <Link href="/">
        <Image alt="LittleHorse" height={24} src="/LH Logo.svg" width={163} />
      </Link>
      <div className="flex ">
      <LoginDropdown />
      <TenantSelector />
      </div>
    </Header>
  );
};
