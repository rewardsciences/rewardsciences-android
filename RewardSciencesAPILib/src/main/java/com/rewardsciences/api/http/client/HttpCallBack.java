/*
 * RewardSciencesAPILib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 09/13/2016
 */
package com.rewardsciences.api.http.client;

import com.rewardsciences.api.http.request.HttpRequest;

/**
 * Callback to be called before and after the HTTP call for an endpoint is made 
 */
public interface HttpCallBack {
    /**
     * Callback called just before the HTTP request is sent 
     * @param request The HTTP request to be executed
     */
    public void OnBeforeRequest(HttpRequest request);
    
    /**
     * Callback called just after the HTTP response is received
     * @param context Context for the HTTP call
     */
    public void OnAfterResponse(HttpContext context);
}