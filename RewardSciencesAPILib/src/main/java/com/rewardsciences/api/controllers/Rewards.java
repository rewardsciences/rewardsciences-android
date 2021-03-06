/*
 * RewardSciencesAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/13/2016
 */
package com.rewardsciences.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import com.rewardsciences.api.*;
import com.rewardsciences.api.models.*;
import com.rewardsciences.api.exceptions.*;
import com.rewardsciences.api.http.client.HttpClient;
import com.rewardsciences.api.http.client.HttpContext;
import com.rewardsciences.api.http.request.HttpRequest;
import com.rewardsciences.api.http.response.HttpResponse;
import com.rewardsciences.api.http.response.HttpStringResponse;
import com.rewardsciences.api.http.client.APICallBack;

public class Rewards extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static Rewards instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the Rewards class 
     */
    public static Rewards getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new Rewards();
            }
        }
        return instance;
    }

    /**
     * Redeem a reward.
     * @param    rewardId    Required parameter: The ID of the reward to be redeemed.
     * @param    userId    Required parameter: The ID of the user who is redeeming the reward.
     * @return    Returns the void response from the API call 
     */
    public void redeemAsync(
                final int rewardId,
                final int userId,
                final APICallBack<DynamicResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rewards/{reward_id}/redemptions");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5468550138074550937L;
            {
                    put( "reward_id", rewardId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5612870676976353411L;
            {
                    put( "user_id", userId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4777451075169080605L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "Accept", Configuration.accept );
                    put( "Content-Type", Configuration.contentType );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Show a reward's details.
     * @param    rewardId    Required parameter: The ID of the reward to be retrieved.
     * @return    Returns the void response from the API call 
     */
    public void showAsync(
                final int rewardId,
                final APICallBack<DynamicResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rewards/{reward_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5614667877815421193L;
            {
                    put( "reward_id", rewardId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5050071214574792761L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "Accept", Configuration.accept );
                    put( "Content-Type", Configuration.contentType );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Bid on a reward auction.
     * @param    rewardId    Required parameter: The ID of the reward auction to be bid on.
     * @param    userId    Required parameter: The ID of the user who is bidding on the reward auction.
     * @param    amount    Required parameter: Can be either 'max' (when max bidding) or the number of points the user wants to bid.
     * @return    Returns the void response from the API call 
     */
    public void bidAsync(
                final int rewardId,
                final int userId,
                final String amount,
                final APICallBack<DynamicResponse> callBack
    ) {
        //validating required parameters
        if (null == amount)
            throw new NullPointerException("The parameter \"amount\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rewards/{reward_id}/bids");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5735261009732457639L;
            {
                    put( "reward_id", rewardId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4952536283098424484L;
            {
                    put( "user_id", userId );
                    put( "amount", amount );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4700391954434244228L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "Accept", Configuration.accept );
                    put( "Content-Type", Configuration.contentType );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * List all the available rewards.
     * @param    categoryId    Optional parameter: The id of the category to filter rewards by
     * @param    limit    Optional parameter: The number of rewards you want to be retrieved.
     * @param    offset    Optional parameter: The number of rewards you want to skip before starting the retrieval.
     * @return    Returns the void response from the API call 
     */
    public void listAsync(
                final Integer categoryId,
                final Integer limit,
                final Integer offset,
                final APICallBack<DynamicResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/rewards");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5180404942721853848L;
            {
                    put( "category_id", categoryId );
                    put( "limit", (null != limit) ? limit : 25 );
                    put( "offset", (null != offset) ? offset : 0 );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5245182469964691820L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "Accept", Configuration.accept );
                    put( "Content-Type", Configuration.contentType );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}