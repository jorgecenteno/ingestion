package com.stratio.ingestion.model.channel;

import java.util.List;

import org.codehaus.jackson.JsonNode;

/**
 * Created by miguelsegura on 18/09/15.
 */
public class Channel {


    private List<JsonNode> settings;


    public List<JsonNode> getSettings() {
        return settings;
    }

    public void setSettings(List<JsonNode> settings) {
        this.settings = settings;
    }

}
