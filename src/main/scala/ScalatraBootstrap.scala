import javax.servlet.ServletContext

import com.github.jt.api.swagger.SwaggerServlet
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext) {
    // swagger setup
    context.mount(new SwaggerServlet, "/swagger-resources")

    // mount servlets like this:
    //context mount (new ArticlesServlet, "/articles/*")
  }
}