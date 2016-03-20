import javax.servlet.ServletContext

import com.github.jt.api.servlet.HealthServlet
import com.github.jt.api.swagger.SwaggerServlet
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext) {
    // swagger setup
    context.mount(new SwaggerServlet, "/swagger-resources")

    // app servlet
    context.mount(new HealthServlet, "/health")
  }
}