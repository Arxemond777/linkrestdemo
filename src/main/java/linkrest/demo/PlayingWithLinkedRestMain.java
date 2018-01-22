package linkrest.demo;

import com.google.inject.Binder;
import com.google.inject.Module;
import io.bootique.Bootique;
import io.bootique.jersey.JerseyModule;
import linkrest.demo.api.PlayingWithLinkedRestApi;

public class PlayingWithLinkedRestMain implements Module {

    public static void main(String[] args) {
        Bootique.app("--config=classpath:playingWithLinkedRest.yml", "--server")
                .autoLoadModules()
                .module(PlayingWithLinkedRestMain.class)
                .run();
    }

    public void configure(Binder binder) {
        JerseyModule
                .contributeResources(binder)
                .addBinding()
                .to(PlayingWithLinkedRestApi.class);
    }
}
