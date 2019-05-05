
package com.klar.quakeapp.models.quake;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("generated")
    @Expose
    private Double generated;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("status")
    @Expose
    private Double status;
    @SerializedName("api")
    @Expose
    private String api;
    @SerializedName("count")
    @Expose
    private Double count;

    public Double getGenerated() {
        return generated;
    }

    public void setGenerated(Double generated) {
        this.generated = generated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

}
