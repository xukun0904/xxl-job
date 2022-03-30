package com.xxl.job.admin.core.model;

/**
 * @author xukun
 * @since 1.0
 */
public class XxlTimeConf {
    /**
     * 调度周期（1：分；2：时；3：天；4：周；5：月）
     */
    private Short schedulePeriod;

    /**
     * 重复周期
     */
    private Integer repetitionPeriod;

    /**
     * 触发时间
     */
    private String triggerTime;

    /**
     * 开始时间
     */
    private String beginTime;

    /**
     * 结束时间
     */
    private String endTime;

    public Short getSchedulePeriod() {
        return schedulePeriod;
    }

    public void setSchedulePeriod(Short schedulePeriod) {
        this.schedulePeriod = schedulePeriod;
    }

    public Integer getRepetitionPeriod() {
        return repetitionPeriod;
    }

    public void setRepetitionPeriod(Integer repetitionPeriod) {
        this.repetitionPeriod = repetitionPeriod;
    }

    public String getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
