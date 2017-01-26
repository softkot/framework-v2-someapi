# framework-v2-someapi
Google Cloud Endpoints Framework V2 on App Engine standard environment gradle based template.

The sample boilerplate code to demonstrate Goolge Endpoints Framework V2 on top of Google App Engine with Gradle build tool as well as some issues with local development server for [StackOverflow question][1].

Change each PROJECT_ID value mentioned below to the real AppEngine project id you have.

## Steps to demonstrate
1. edit appengine-web.xml in case wish to change default appengine service name (framework-v2-someapi) and change that name on step 5 as well.  
1. gcloud auth login
1. gcloud config set project PROJECT_ID 
1. ./gradlew appengineDeploy 
1. gcloud app browse -s framework-v2-someapi
1. Click API link in new opened browser window.
1. Play with API Explorer and check the Services > someapi API v1 > someapi.method.getHash works fine.
1. ./gradlew appengineStart and open http://localhost:8080 to try do the same localy and get errors instead. 

[1]: http://stackoverflow.com/questions/41839651/appengine-local-dev-server-for-google-cloud-endpoints-framework-v2-not-work