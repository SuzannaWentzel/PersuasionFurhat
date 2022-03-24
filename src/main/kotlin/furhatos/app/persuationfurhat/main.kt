package furhatos.app.persuationfurhat

import furhatos.app.persuationfurhat.flow.*
import furhatos.skills.Skill
import furhatos.flow.kotlin.*

class PersuationfurhatSkill : Skill() {
    override fun start() {
        Flow().run(Idle)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
