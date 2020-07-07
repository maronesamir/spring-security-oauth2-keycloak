Curl commands:
```
ATOKEN=$(curl --data "grant_type=password&client_id=demo-app&username=johndoe&password=johndoe" http://localhost:8090/auth/realms/wstutorial/protocol/openid-connect/token | jq -r '.access_token')
curl -i http://localhost:8088 -H "Authorization: bearer $ATOKEN" --insecure
curl -i http://localhost:8088/protected -H "Authorization: bearer $ATOKEN" --insecure
curl -i http://localhost:8088/admin -H "Authorization: bearer $ATOKEN" --insecure
```

More articles can be found here: https://wstutorial.com

