package com.github.mlgpenguin.multiplatformtemplate.velocity

import com.google.inject.Inject
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.proxy.ProxyServer
import org.slf4j.Logger

@Plugin(id = "multiplatformtemplate", name = "MultiPlatformTemplate", version = "%version%")
class MultiPlatformTemplate @Inject constructor(val server: ProxyServer, val logger: Logger) {

    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent?) {
    }


}