package com.artshell;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PumpModule_ProvidePumpFactory implements Factory<Pump> {
  private final Provider<Thermosiphon> pumpProvider;

  public PumpModule_ProvidePumpFactory(Provider<Thermosiphon> pumpProvider) {
    this.pumpProvider = pumpProvider;
  }

  @Override
  public Pump get() {
    return Preconditions.checkNotNull(
        PumpModule.providePump(pumpProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Pump> create(Provider<Thermosiphon> pumpProvider) {
    return new PumpModule_ProvidePumpFactory(pumpProvider);
  }

  public static Pump proxyProvidePump(Thermosiphon pump) {
    return PumpModule.providePump(pump);
  }
}
