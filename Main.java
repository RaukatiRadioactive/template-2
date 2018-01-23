package br.com.seudominio.template;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public static Main m;

	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Template] " + ChatColor.GREEN + "Plugin Ativado");
	}

	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Template] " + ChatColor.RED + "Plugin Desativado");
	}

	public void onLoad() {
		m = this;
	}
}