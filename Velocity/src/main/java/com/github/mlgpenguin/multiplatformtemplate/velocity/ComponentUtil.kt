package com.github.mlgpenguin.multiplatformtemplate.velocity

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.TextComponent
import net.kyori.adventure.text.event.ClickEvent
import net.kyori.adventure.text.event.HoverEvent
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration

fun text(text: String, color: TextColor? = null, vararg decos: TextDecoration? = arrayOf()) = Component.text(text, color, *decos)

fun TextComponent.append(text: String, color: TextColor? = null, vararg decos: TextDecoration? = arrayOf()) = append(text(text, color, *decos))
fun TextComponent.suggestOnClick(command: String) = clickEvent(ClickEvent.suggestCommand(command))
fun TextComponent.showOnHover(text: String, color: TextColor? = null, vararg decos: TextDecoration? = arrayOf()) =
    hoverEvent(HoverEvent.showText(text(text, color, *decos)))
