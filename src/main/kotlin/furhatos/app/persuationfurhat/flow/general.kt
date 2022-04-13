package furhatos.app.persuationfurhat.flow

import furhatos.flow.kotlin.*
import furhatos.util.*

val Idle: State = state {

    init {
        furhat.setVoice(Language.ENGLISH_US, Gender.MALE)
        if (users.count > 0) {
            furhat.attend(users.random)
            goto(Start)
        }
    }

    onEntry {
        furhat.attendNobody()
    }

    onUserEnter {
        furhat.attend(it)
        goto(Start)
    }
}

val Interaction: State = state {

    onUserLeave(instant = true) {
        if (users.count > 0) {
            if (it == users.current) {
                furhat.attend(users.other)
                goto(Start)
            } else {
                furhat.glance(it)
            }
        } else {
            goto(Idle)
        }
    }

    onUserEnter(instant = true) {
        furhat.glance(it)
    }

}
val dialogState = state(parent = null) {
    var noinput = 0
    var nomatch = 0

    onResponse {
        nomatch++
        if (nomatch > 1)
            furhat.say("Sorry, I still didn't understand that one")
        else
            furhat.say("Sorry, I didn't understand that one")
        goto(askLastQuestion)
    }

    onNoResponse {
        noinput++
        if (noinput > 1)
            furhat.say("Sorry, I still didn't hear you, can you try to speak a bit louder?")
        else
            furhat.say("Sorry, I didn't hear you")
        goto(askLastQuestion)
    }

    onResponseFailed {
        furhat.say("Sorry, my speech recognizer is not working")
        terminate()
    }
}