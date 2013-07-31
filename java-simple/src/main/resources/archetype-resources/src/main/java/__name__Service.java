package ${package};

import com.codahale.dropwizard.Application;
import com.codahale.dropwizard.setup.Bootstrap;
import com.codahale.dropwizard.setup.Environment;

public class ${name}Service extends Application<${name}Configuration> {

    public static void main(String[] args) throws Exception {
        new ${name}Service().run(args);
    }

    @Override
    public String getName() {
        return "${name}";
    }
    
	@Override
	public void initialize(Bootstrap<${name}Configuration> bootstrap) {
	}

    @Override
    public void run(${name}Configuration configuration, Environment environment) {
        // TODO: implement service, add resources, healthchecks etc...
    }

}
