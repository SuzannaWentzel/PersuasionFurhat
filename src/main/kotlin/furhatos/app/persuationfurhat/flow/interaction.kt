package furhatos.app.persuationfurhat.flow

import furhatos.nlu.common.*
import furhatos.flow.kotlin.*

val Start : State = state(Interaction) {

    onEntry {
        furhat.ask("Hi there. Bye?")
    }

    onResponse<Yes>{
        furhat.say("I like humans.")
    }

    onResponse<No>{
        furhat.say("That's sad.")
    }
}
