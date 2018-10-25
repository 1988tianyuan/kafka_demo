package com.liugeng.kafka_demo.model;

import java.util.List;
import java.util.Objects;

import com.liugeng.kafka_demo.model.code.resourcedata.DataTypeCode;
import com.liugeng.kafka_demo.model.code.resourcedata.EventTypeCode;
import com.liugeng.kafka_demo.model.code.resourcedata.ResultTypeCode;
import com.liugeng.kafka_demo.model.code.resourcedata.SourceTypeCode;

public class ResourceData {

    /** */
    private String nrn;
    /** */
    private String resourceName;
    /** */
    private String idNo;
    /** */
    private String request;
    /** */
    private ResultTypeCode resultTypeCode;
    /** */
    private EventTypeCode eventTypeCode;
    /** */
    private String prodStatus;
    /** */
    private List<String> relatedNrn;
    /** */
    private long eventTimestamp;
    /** */
    private SourceTypeCode sourceTypeCode;
    /** */
    private String sourceIp;
    /** */
    private String logMessage;
    /** */
    private DataTypeCode dataTypeCode;
    /** */
    private String data;

    public ResourceData() {
    }

    public ResourceData(String nrn, String resourceName, String idNo, String request, ResultTypeCode resultTypeCode, EventTypeCode eventTypeCode, String prodStatus, List<String> relatedNrn, long eventTimestamp, SourceTypeCode sourceTypeCode, String sourceIp, String logMessage, DataTypeCode dataTypeCode, String data) {
        this.nrn = nrn;
        this.resourceName = resourceName;
        this.idNo = idNo;
        this.request = request;
        this.resultTypeCode = resultTypeCode;
        this.eventTypeCode = eventTypeCode;
        this.prodStatus = prodStatus;
        this.relatedNrn = relatedNrn;
        this.eventTimestamp = eventTimestamp;
        this.sourceTypeCode = sourceTypeCode;
        this.sourceIp = sourceIp;
        this.logMessage = logMessage;
        this.dataTypeCode = dataTypeCode;
        this.data = data;
    }

    public String getNrn() {
        return nrn;
    }

    public void setNrn(String nrn) {
        this.nrn = nrn;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public ResultTypeCode getResultTypeCode() {
        return resultTypeCode;
    }

    public void setResultTypeCode(ResultTypeCode resultTypeCode) {
        this.resultTypeCode = resultTypeCode;
    }

    public EventTypeCode getEventTypeCode() {
        return eventTypeCode;
    }

    public void setEventTypeCode(EventTypeCode eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
    }

    public String getProdStatus() {
        return prodStatus;
    }

    public void setProdStatus(String prodStatus) {
        this.prodStatus = prodStatus;
    }

    public List<String> getRelatedNrn() {
        return relatedNrn;
    }

    public void setRelatedNrn(List<String> relatedNrn) {
        this.relatedNrn = relatedNrn;
    }

    public long getEventTimestamp() {
        return eventTimestamp;
    }

    public void setEventTimestamp(long eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    public SourceTypeCode getSourceTypeCode() {
        return sourceTypeCode;
    }

    public void setSourceTypeCode(SourceTypeCode sourceTypeCode) {
        this.sourceTypeCode = sourceTypeCode;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }

    public DataTypeCode getDataTypeCode() {
        return dataTypeCode;
    }

    public void setDataTypeCode(DataTypeCode dataTypeCode) {
        this.dataTypeCode = dataTypeCode;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResourceData)) return false;
        ResourceData that = (ResourceData) o;
        return Objects.equals(nrn, that.nrn) &&
                Objects.equals(resourceName, that.resourceName) &&
                Objects.equals(idNo, that.idNo) &&
                Objects.equals(request, that.request) &&
                resultTypeCode == that.resultTypeCode &&
                eventTypeCode == that.eventTypeCode &&
                Objects.equals(prodStatus, that.prodStatus) &&
                Objects.equals(relatedNrn, that.relatedNrn) &&
                sourceTypeCode == that.sourceTypeCode &&
                Objects.equals(sourceIp, that.sourceIp) &&
                dataTypeCode == that.dataTypeCode &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrn, resourceName, idNo, request, resultTypeCode, eventTypeCode, prodStatus, relatedNrn, sourceTypeCode, sourceIp, dataTypeCode, data);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResourceData{");
        sb.append("nrn='").append(nrn).append('\'');
        sb.append(", resourceName='").append(resourceName).append('\'');
        sb.append(", idNo='").append(idNo).append('\'');
        sb.append(", request='").append(request).append('\'');
        sb.append(", resultTypeCode=").append(resultTypeCode);
        sb.append(", eventTypeCode=").append(eventTypeCode);
        sb.append(", prodStatus='").append(prodStatus).append('\'');
        sb.append(", relatedNrn=").append(relatedNrn);
        sb.append(", eventTimestamp=").append(eventTimestamp);
        sb.append(", sourceTypeCode=").append(sourceTypeCode);
        sb.append(", sourceIp='").append(sourceIp).append('\'');
        sb.append(", logMessage='").append(logMessage).append('\'');
        sb.append(", dataTypeCode=").append(dataTypeCode);
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
