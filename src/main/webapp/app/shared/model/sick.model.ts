export interface ISick {
  id?: number;
  reason?: string;
  days?: number;
  jobKey?: number;
  auditUserId?: number;
}

export const defaultValue: Readonly<ISick> = {};
