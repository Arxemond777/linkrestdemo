package linkrest.demo;

import io.bootique.Bootique;
import io.bootique.jersey.JerseyModule;
import com.google.inject.Binder;
import com.google.inject.Module;
import linkrest.demo.api.ScheduleApi;

public class ScheduleMain implements Module {
    public static void main(String[] args) {
        Bootique.app("--config=classpath:schedule.yml", "--server")
                .autoLoadModules()
                .module(ScheduleMain.class)
                .exec()
                .exit();
    }

    public void configure(Binder binder) {
        JerseyModule.extend(binder).addResource(ScheduleApi.class);
    }
}
