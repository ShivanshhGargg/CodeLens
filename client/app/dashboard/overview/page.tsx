"use client";

import { AppShell } from "@/components/layout/app-shell";
import { OverviewDashboard } from "@/components/dashboard/overview-dashboard";
import { RequireAuth } from "@/components/providers/require-auth";

export default function DashboardOverviewPage() {
    return (
        <RequireAuth>
            <AppShell hideHeader>
                <OverviewDashboard />
            </AppShell>
        </RequireAuth>
    );
}
