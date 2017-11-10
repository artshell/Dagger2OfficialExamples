package com.artshell;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(includes = PumpModule.class)
public class DripCoffeeModule {

    @Singleton
    @Provides
    static Heater provideHeater(){
        return new ElectricHeater();
    }
}
