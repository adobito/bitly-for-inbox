package controllers

import play.api._
import play.api.mvc._
import com.google.gson.Gson
import classes.Message
import com.google.gson.JsonElement
import com.rosaloves.bitlyj.Bitly._
import com.rosaloves.bitlyj.Url
import com.google.api.client.http.HttpRequest
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.http.GenericUrl
import shortUrl.ShortenedUrl
import com.google.api.client.util.Maps
import com.google.api.client.http.HttpContent
import com.google.api.client.http.json.JsonHttpContent
import com.google.api.client.json.jackson.JacksonFactory
import com.google.api.client.util.GenericData
import com.google.api.client.http.HttpHeaders

object InboxHook  extends Controller {
val RequestFactory = new NetHttpTransport().createRequestFactory();
val ServerKey = "yQxhVz87zHEs3tcVhlKq7pdTfrjedB8BirzvoIo7mhBRVasEVYRQKovlyvDj";
val JacksonFactory = new JacksonFactory();
	def hook = Action {
		request =>
		val jsonString = request.body.asJson.get.toString()
		val message = new Gson().fromJson(jsonString, classOf[Message])
		val messageString = if(!message.getData.getText().startsWith("http://") || message.getData().getText().startsWith("https://")) {
		  "http://" + message.getData().getText();
		} else {
		  message.getData().getText();
		};
		val sender = message.getSender().getUsername();
		val url = new GenericUrl("https://api-ssl.bitly.com/v3/shorten?access_token=4ca8fc0cda67f062fca5aac90669c91a649f7696&longUrl=" + messageString + "&domain=bit.ly&format=json"); 
		val getRequest = RequestFactory.buildGetRequest(url)
		val response = getRequest.execute();
		val responseString = response.parseAsString();
		val shortUrl = new Gson().fromJson(responseString, classOf[ShortenedUrl]);
		sendMessage(sender,shortUrl.getData().getUrl());
		Ok(response.parseAsString());
	}
	
	def sendMessage(to: String, message: String) {
	  val postUrl = new GenericUrl("https://devs.inboxtheapp.com/message");
	  val genericData = new GenericData();
	  genericData.put("to", to);
	  genericData.put("text", message);
	  val content =  new JsonHttpContent(JacksonFactory, genericData);
	  val post = RequestFactory.buildPostRequest(postUrl, content);
	  val headers = new HttpHeaders();
	  headers.setAuthorization("bearer yQxhVz87zHEs3tcVhlKq7pdTfrjedB8BirzvoIo7mhBRVasEVYRQKovlyvDj");
	  post.setHeaders(headers)
	  post.execute();
	}
	
	
}  