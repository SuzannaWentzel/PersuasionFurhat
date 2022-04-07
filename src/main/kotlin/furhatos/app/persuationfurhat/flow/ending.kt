package furhatos.app.persuationfurhat.flow
import furhatos.app.persuationfurhat.flow.Interaction
import furhatos.app.persuationfurhat.nlu.Greetings
import furhatos.app.persuationfurhat.nlu.Opinion
import furhatos.flow.kotlin.*
import furhatos.gestures.Gestures
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val ending: State = state(Interaction) {
    onEntry {
        furhat.say(getRandomShowUnderstanding())
        furhat.say("We had a great talk, thanks!")
        furhat.ask("Did I change your opinion about eating meat in any way?")

    }

    onResponse<Opinion>{
        print(it.text)
        dialogLogger.endSession()
    }
    onResponse<Yes> {
        if (it.text.length > 10){
            print(it.text)
            dialogLogger.endSession()
        } else {
            goto(ending2)
        }
    }
    onResponse<No> {
        if (it.text.length > 10){
            print(it.text)
            dialogLogger.endSession()
        } else {
            goto(ending3)
        }
    }
}
val ending2: State = state(Interaction) {
    onEntry {
        furhat.ask("Please tell me how your opinion has changed")
    }
    onResponse<Opinion>{
        print(it.text)
        dialogLogger.endSession()

    }
}
val ending3: State = state(Interaction) {
    onEntry {
        furhat.ask("please tell my your original opinion")
    }
    onResponse<Opinion>{
        print(it.text)
        dialogLogger.endSession()

    }
}