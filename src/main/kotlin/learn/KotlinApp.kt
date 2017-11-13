package learn

/**
 *
 */
class Point(x: Int, y: Int) // Primärkonstruktor

class Point2(val x: Int, var y: Int) // read-only and read-write properties

data class Point3(val x: Int, var y: Int) // generate hash(), equals(), etc.

data class Point4(var x: Int, var y: Int) {
	init {
		x = 1
		y = 2
	}
}

/**
 *
 */
fun main(args: Array<String>) {
	// 1.
	val name = args.getOrElse(0) { "Welt" }
	println("Hallo $name!")

	// 2.
	val myMap = mapOf(1 to "eins", 2 to "zwei")
	for ((key, value) in myMap) println("key: $key, value: $value")

	// 3.
	val stock = 1
	val color =
			if (stock == 0) "Rot"
			else if (stock < 10) "Gelb"
			else "Grün"
	println(color)

	// 4.
	val x = 9
	val zahl = when (x) {
		0 -> "nix"
		1, 2 -> "eins oder zwei"
		in 1..9 -> "einstellig"
	//!is Int -> "keine Zahl"
		else -> "irgendwas"
	}
	println(zahl)

	// 5.
	val p = Point3(6, 9)
	println("x=${p.x}, y=${p.y}")

	val p2 = Point4(5, 5)
	println("x=${p2.x}, y=${p2.y}")
}
