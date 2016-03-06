package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }
  def instal1 = Action {
    Ok(views.html.instal())
  }
  def sign1 = Action {
    Ok(views.html.sign())
  }
  def setup1 = Action {
    Ok(views.html.setup())
  }
  def triger1 = Action {
    Ok(views.html.triger())
  }

}