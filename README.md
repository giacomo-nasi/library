# library

Progetto per la realizzazione, mediante jersey e implementando le JAX-RS, di un endpoint in ascolto sulla porta 8080.
Dopo aver clonato la repository è necessario recarsi da prompt dei comandi nella cartella del progetto: fatto ciò essguire il comando 
"mvn jetty:run -Dorg.eclipse.jetty.annotations.maxWait=120".
Il server sarà così in ascolto di tutte le notifiche in arrivo dalla subscription effettuata nel progetto testDomotica.
A fine di testing è possibile provare a inviare una notifica tramite Postman, come in qusto esempio:

![notiAPI POST](https://user-images.githubusercontent.com/83088067/173630714-efa5cb31-95b9-44cb-84a9-5b33518934d6.png)
