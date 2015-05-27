package com.qianmi.form;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 实例查询结果
 */
public class InstanceStatus {
    /**
     * 实例ID
     */
    private String instanceId;
    /**
     * 实例状态
     * Running
     * Stopped
     *
     */
    private String status;

    public InstanceStatus(String instanceId, String status) {
        this.instanceId = instanceId;
        this.status = status;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("instanceId", instanceId)
                .append("status", status)
                .toString();
    }
}
