package com.example.pluginName

import org.bukkit.plugin.java.JavaPlugin

class PluginName : JavaPlugin() {
    override fun onEnable() {
        // Your logic for onEnable
        logger.info("Successfully enabled template plugin!")
    }

    override fun onDisable() {
        // Your logic for onDisable
        logger.info("Successfully disabled template plugin.")
    }
}