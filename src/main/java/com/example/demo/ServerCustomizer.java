@Component  
public class ServerCustomizer implements EmbeddedServletContainerCustomizer   
{  
@Override  
public void customize(ConfigurableEmbeddedServletContainer container)   
{  
container.setPort(8181);  
}  
}  
