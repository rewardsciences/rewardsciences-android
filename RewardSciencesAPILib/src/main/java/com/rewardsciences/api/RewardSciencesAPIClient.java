/*
 * RewardSciencesAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.rewardsciences.api;

import com.rewardsciences.api.controllers.*;
import com.rewardsciences.api.http.client.HttpClient;

public class RewardSciencesAPIClient {
    /**
     * Singleton access to Rewards controller
     * @return	Returns the Rewards instance 
     */
    public Rewards getRewards() {
        return Rewards.getInstance();
    }

    /**
     * Singleton access to Users controller
     * @return	Returns the Users instance 
     */
    public Users getUsers() {
        return Users.getInstance();
    }

    /**
     * Singleton access to RewardCategories controller
     * @return	Returns the RewardCategories instance 
     */
    public RewardCategories getRewardCategories() {
        return RewardCategories.getInstance();
    }

    /**
     * Singleton access to Activities controller
     * @return	Returns the Activities instance 
     */
    public Activities getActivities() {
        return Activities.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public RewardSciencesAPIClient() {	
        Configuration.accept = "application/vnd.rewardsciences.v1+json";
        Configuration.contentType = "application/json";
	}

    /**
     * Client initialization constructor 
     */     
    public RewardSciencesAPIClient(String accept, String contentType, String oAuthAccessToken) {
        this();
        if(accept != null) Configuration.accept = accept;
        if(contentType != null) Configuration.contentType = contentType;
        Configuration.oAuthAccessToken = oAuthAccessToken;
    }
}