package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  def index = Action {
    Ok((System.currentTimeMillis() / 1000).toString)
  }
}
