@Component  
public class ServerCustomizer implements WebServerFactoryCustomizer< ConfigurableWebServerFactory <   
{  
@Override  
public void customize(ConfigurableWebServerFactory factory)   
{  
factory.setPort(9001);  
}  
}  
