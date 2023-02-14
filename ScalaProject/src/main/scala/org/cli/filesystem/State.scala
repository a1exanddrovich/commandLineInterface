package org.cli.filesystem

import org.cli.files.Directory

class State(val root: Directory, val workingDirectory: Directory, val output: String) {

  def show(): Unit = {
    println(output)
    print(State.SHELL_TOKEN)
  }

  def setMessage(message: String):State =
    State(root, workingDirectory, message)
}

object State {
  val SHELL_TOKEN = "$ "

  def apply(root: Directory, workingDirectory: Directory, output: String = ""): State = new State(root, workingDirectory, output)

}
