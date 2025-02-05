package de.woitaschek.aoc.year2021

import de.woitaschek.aoc.year2021.day01.Day1
import de.woitaschek.aoc.year2021.day02.Day2
import de.woitaschek.aoc.year2021.day03.Day3
import de.woitaschek.aoc.year2021.day04.Day4
import de.woitaschek.aoc.year2021.day05.Day5
import de.woitaschek.aoc.year2021.day06.Day6
import de.woitaschek.aoc.year2021.day07.Day7
import de.woitaschek.aoc.year2021.day08.Day8
import de.woitaschek.aoc.year2021.day08.Display
import de.woitaschek.aoc.year2021.day09.Day9
import de.woitaschek.aoc.year2021.day10.Day10
import de.woitaschek.aoc.year2021.day11.Day11
import de.woitaschek.aoc.year2021.day12.Day12
import de.woitaschek.aoc.year2021.day13.Day13
import de.woitaschek.aoc.year2021.day15.Day15
import de.woitaschek.aoc.year2021.day17.Day17
import de.woitaschek.aoc.year2021.day18.Day18
import de.woitaschek.aoc.year2021.day25.Day25
import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class AdventOfCodeTests {

  @Test
  fun day1() {
    Day1.test(part1 = 7, part2 = 5)
  }

  @Test
  fun day2() {
    Day2.test(part1 = 150, part2 = 900)
  }

  @Test
  fun day3() {
    Day3.test(part1 = 198, part2 = 230)
  }

  @Test
  fun day4() {
    Day4.test(part1 = 4512, part2 = 1924)
  }

  @Test
  fun day5() {
    Day5.test(part1 = 5, part2 = 12)
  }

  @Test
  fun day6() {
    Day6.test(part1 = 5934, part2 = 26984457539)
  }

  @Test
  fun day7() {
    Day7.test(part1 = 37, part2 = 168)
  }

  @Test
  fun day8() {
    Day8.test(part1 = 26, part2 = 61229)
  }

  @Test
  fun day8Display() {
    val expected = listOf(
      8394,
      9781,
      1197,
      9361,
      4873,
      8418,
      4548,
      1625,
      8717,
      4315,
    )
    assertSoftly {
      input(8).lines()
        .forEachIndexed { index, line ->
          withClue(line) {
            val outputValue = Display.parse(line).outputValue()
            outputValue shouldBe expected[index]
          }
        }
    }
  }

  @Test
  fun day9() {
    Day9.test(part1 = 15, part2 = 1134)
  }

  @Test
  fun day10() {
    Day10.test(part1 = 26397, part2 = 288957)
  }

  @Test
  fun day11() {
    Day11.test(part1 = 1656, part2 = 195)
  }

  @Test
  fun day12() {
    Day12.test(part1 = 10, part2 = 36)
  }

  @Test
  fun day13() {
    Day13.test(
      part1 = 17,
      part2 = """
        █████
        █   █
        █   █
        █   █
        █████

        """.trimIndent()
    )
  }

  @Test
  fun day15() {
    Day15.test(part1 = 40, part2 = null)
  }

  @Test
  fun day17() {
    Day17.test(part1 = 45, part2 = 112)
  }

  @Test
  fun day18() {
    Day18.test(part1 = 4140, part2 = 3993)
  }

  @Test
  fun day25() {
    Day25.test(part1 = 58, part2 = null)
  }

  private fun Puzzle.test(part1: Any?, part2: Any?) {
    val input = input(day)
    if (part1 != null) {
      solvePart1(input) shouldBe part1
    }
    if (part2 != null) {
      solvePart2(input) shouldBe part2
    }
  }
}

private fun input(day: Int): String = input("2021/day$day.txt")

@Suppress("unused")
fun currentTaskInput(): String = input("2021/task.txt")

fun input(fileName: String): String {
  return ClassLoader
    .getSystemResourceAsStream(fileName)!!
    .bufferedReader()
    .readText()
}
