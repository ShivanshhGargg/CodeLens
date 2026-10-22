"use client";

import { AppShell } from "@/components/layout/app-shell";
import { SettingsDashboard } from "@/components/dashboard/settings-dashboard";
import { RequireAuth } from "@/components/providers/require-auth";

export default function DashboardSettingsPage() {
    return (
        <RequireAuth>
            <AppShell hideHeader>
                <SettingsDashboard />
            </AppShell>
        </RequireAuth>
    );
}
