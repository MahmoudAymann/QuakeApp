
package com.klar.quakeapp.models.quake;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties {

    @SerializedName("mag")
    @Expose
    private Double mag;
    @SerializedName("place")
    @Expose
    private String place;
    @SerializedName("time")
    @Expose
    private Double time;
    @SerializedName("updated")
    @Expose
    private Double updated;
    @SerializedName("tz")
    @Expose
    private Double tz;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("detail")
    @Expose
    private String detail;
    @SerializedName("felt")
    @Expose
    private Object felt;
    @SerializedName("cdi")
    @Expose
    private Object cdi;
    @SerializedName("mmi")
    @Expose
    private Double mmi;
    @SerializedName("alert")
    @Expose
    private String alert;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("tsunami")
    @Expose
    private Double tsunami;
    @SerializedName("sig")
    @Expose
    private Double sig;
    @SerializedName("net")
    @Expose
    private String net;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("ids")
    @Expose
    private String ids;
    @SerializedName("sources")
    @Expose
    private String sources;
    @SerializedName("types")
    @Expose
    private String types;
    @SerializedName("nst")
    @Expose
    private Object nst;
    @SerializedName("dmin")
    @Expose
    private Double dmin;
    @SerializedName("rms")
    @Expose
    private Double rms;
    @SerializedName("gap")
    @Expose
    private Double gap;
    @SerializedName("magType")
    @Expose
    private String magType;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;

    public Double getMag() {
        return mag;
    }

    public void setMag(Double mag) {
        this.mag = mag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public Double getUpdated() {
        return updated;
    }

    public void setUpdated(Double updated) {
        this.updated = updated;
    }

    public Double getTz() {
        return tz;
    }

    public void setTz(Double tz) {
        this.tz = tz;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Object getFelt() {
        return felt;
    }

    public void setFelt(Object felt) {
        this.felt = felt;
    }

    public Object getCdi() {
        return cdi;
    }

    public void setCdi(Object cdi) {
        this.cdi = cdi;
    }

    public Double getMmi() {
        return mmi;
    }

    public void setMmi(Double mmi) {
        this.mmi = mmi;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTsunami() {
        return tsunami;
    }

    public void setTsunami(Double tsunami) {
        this.tsunami = tsunami;
    }

    public Double getSig() {
        return sig;
    }

    public void setSig(Double sig) {
        this.sig = sig;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public Object getNst() {
        return nst;
    }

    public void setNst(Object nst) {
        this.nst = nst;
    }

    public Double getDmin() {
        return dmin;
    }

    public void setDmin(Double dmin) {
        this.dmin = dmin;
    }

    public Double getRms() {
        return rms;
    }

    public void setRms(Double rms) {
        this.rms = rms;
    }

    public Double getGap() {
        return gap;
    }

    public void setGap(Double gap) {
        this.gap = gap;
    }

    public String getMagType() {
        return magType;
    }

    public void setMagType(String magType) {
        this.magType = magType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}