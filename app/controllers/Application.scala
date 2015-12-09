package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

}


// package com.devdaily.twitterclient
// import twitter4j.TwitterFactory
// import twitter4j.Twitter
// import twitter4j.conf.ConfigurationBuilder
 
// object ScalaTwitterClient {
   
//   def main(args : Array[String]) {
     
//     //config work to create a twitter object
//     val cb = new ConfigurationBuilder()
//     cb.setDebugEnabled(true)
//       .setOAuthConsumerKey("TvBbzXcHAUtEJc8gyxCgugrmh")
//       .setOAuthConsumerSecret("ImpZW001LzUcPPOFqw8T9cdw5hmSU2iXCUe3yob5eKBYxVZBlw")
//       .setOAuthAccessToken("3275026076-ZQ2Pt4VoF0VnyKrSQXTlHVkrUb8kwskHWyIfe5b")
//       .setOAuthAccessTokenSecret("oPBneGsF97Jn29Ih1JtDSO24eEzLPl0mv9eJZPpgpXMSA")
//     val tf = new TwitterFactory(cb.build())
//     val twitter = tf.getInstance()
 
//     // (2) use the twitter object to get your friend's timeline
//     val statuses = twitter.getFriendsTimeline()
//     System.out.println("Showing friends timeline.")
//     val it = statuses.iterator()
//     while (it.hasNext()) {
//       val status = it.next()
//       println(status.getUser().getName() + ":" +
//               status.getText());
//     }
 
//   }
// }
