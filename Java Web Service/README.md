# Instructions to create and deploy ScoreWebService

## You'll need:

- [Apache Eclipse IDE]()
- [Apache TomCat Server]()

## Steps
*Here, I am assuming that you have a compatible IDE and Server already installed and set up. If not, I would recommend using Apache Eclipse IDE and Apache TomEE Server. I have used the same for creating and deploying the web service. If you are using any other IDEs or Servers, the steps may vary.*

1. Create a Dynamic Web Project in Apache Eclipse and provide the necessary GroupId and ArtifactID to get started.
2. Generate [Score.java](/Java%20Web%20Service/src/main/java/scorewebservice/Score.java) and [ScoreService.java](/Java%20Web%20Service/src/main/java/scorewebservice/ScoreService.java).
3. Right-click on the project and click on New > Other > Web Service
4. Provide the Service Implementation as ScoreService.java. If you just want to assemble the Web Service implementation as a WSDL file, move the slider next to the web service to **Assemble service**. If you want to deploy it to TomCat or TomEE, move the slider to the very top, to **Start service**. Now, click on Next.
5. Select all the methods to implement in the web service and click on Finish. If it asks to start TomCat or TomEE to deploy the web service to the server, start the server.
6. You can also choose to test the web service through an Eclipse Web Service client. However, it is recommended to use an API Platform like [Postman to test SOAP APIs](https://learning.postman.com/docs/sending-requests/soap/making-soap-requests/). If you do want to test the service using Eclipse's built-in client, I would recommend you to refer to [this PDF](), which is the original document this tutorial is based on.

## Gist of the ScoreWebService
- The Score Class defines a mock Scoreboard which counts the number of Wins and Losses.
- There are four methods implemented in the SOAP web service:
1. getScore() → Gets the current number of wins and losses.
2. addWin() → Increment the Win counter in the scoreboard.
3. addLoss() → Increment the Loss counter in the scoreboard.
4. resetScore() → Resets both the Win and Loss counters to 0.

## Testing the Web Service in Postman

*Read [this](https://learning.postman.com/docs/sending-requests/soap/making-soap-requests/) before going any further into this section.*

*Make sure the service is deployed on TomCat or TomEE before testing.*

1. Invoke getScore() → Score: Win = 0, Loss = 0

<img width="500" alt="Invoke getScore()" src="/Java%20Web%20Service/assets/SOAP1.png">


2. Invoke addWin() → Score: Win = 1, Loss = 0

<img width="500" alt="Invoke getScore()" src="/Java%20Web%20Service/assets/SOAP2.png">

3. Invoke addLoss() → Score: Win = 1, Loss = 1

<img width="500" alt="Invoke getScore()" src="/Java%20Web%20Service/assets/SOAP3.png">

4. Invoke addLoss() → Score: Win = 1, Loss = 2

<img width="500" alt="Invoke getScore()" src="/Java%20Web%20Service/assets/SOAP4.png">

5. Invoke getScore() → Score: Win = 1, Loss = 2

<img width="500" alt="Invoke getScore()" src="/Java%20Web%20Service/assets/SOAP5.png">

6. Invoke resetScore() → Score: Win = 0, Loss = 0

<img width="500" alt="Invoke getScore()" src="/Java%20Web%20Service/assets/SOAP6.png">

7. Invoke getScore() → Score: Win = 0, Loss = 0

<img width="500" alt="Invoke getScore()" src="/Java%20Web%20Service/assets/SOAP7.png">
