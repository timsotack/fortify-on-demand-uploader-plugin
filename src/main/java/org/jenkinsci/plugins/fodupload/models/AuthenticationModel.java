package org.jenkinsci.plugins.fodupload.models;

public class AuthenticationModel {
    private String projectAuthType;
    private String clientId;
    private String clientSecret;
    private String username;
    private String personalAccessToken;
    
    public AuthenticationModel( String projectAuthType,
                                String clientId ,
                                String clientSecret,
                                String username,
                                String personalAccessToken){
        this.projectAuthType = projectAuthType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.username = username;
        this.personalAccessToken = personalAccessToken;
    }
    
    public String getProjectAuthType()
    {
        return projectAuthType;
    }
    
    public String getClientId()
    {
        return clientId;
    }
    
    public String getClientSecret()
    {
        return clientSecret;
    }
    
    public String getUsername()
    {
        return username;
    }
    public String getPersonalAccessToken()
    {
        return personalAccessToken;
    }
}
