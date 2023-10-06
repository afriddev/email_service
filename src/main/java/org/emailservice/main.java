package  org.emailservice;


public class main{
    public static void main(String[] args) {
        emailservice emailSender = new emailservice("afridayan01@gmail.com",
                "title","subject","hello world!");
        //System.out.println(emailSender.sendEmail());
        var response = emailSender.sendEmail();
        if(response.get("message") == "emailSendSuccess"){
            System.out.println(
                    "message : " + response.get("message") + " title: " + response.get("title")
                            +" subject: " + response.get("subject") + " body : "+ response.get("body")
            );

            // if you send fromEmail and passkey add fromEmail also
//            System.out.println("fromEmail: "+response.get("fromEmail"));
        }
        else{
            System.out.println(response);
        }
    }
}
