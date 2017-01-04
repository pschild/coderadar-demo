public class Cc {
    private void testCc() {   // 1
        if (a == b)  {                    // 2
            if (a1 == b1                 // 3
                && c1 == d1) {   // 4
               fiddle();
            }
            else if (a2 == b2            // 5
                      || c1 < d1) {   // 6
                fiddle();
            }
            else {
                fiddle();
            }
       }
        else if (c == d) {               // 7
            while (c == d) {             // 8
                fiddle();
            }
        }
         else if (e == f) {
            for (n = 0; n < h         // 9
                    || n < 6; n++) {  // 10
                fiddle();
            }
        }
        else {
            switch (z) {
              case 1:                    // 11
                    fiddle();
                    break;
              case 2:                    // 12
                    fiddle();
                    break;
              default:
                    fiddle();
                    break;
            }
        }
    }
    
    public boolean validate(final BindingResult bindingResult) {
        boolean validate = true;
        for (String channel : getConfiguredChannels()) {
            switch (channel) {
            case "SMS":
                // do nothing
                break;
            case "Email":
                // do nothing
                break;
            case "Facebook":
                // do nothing
break;
            case "Voice":
                final SpelExpressionParser parser = new SpelExpressionParser();
                if (parser
                        .parseExpression(
                                "!voiceMessageForm.audioForms.?[audioId == '' || audioId == null].isEmpty()")
                        .getValue(this, Boolean.class)) {
                    bindingResult.rejectValue("voiceMessageForm.audioForms",
                            "message.voice.provide.all.audios");
                    validate = false;
                }
                boolean voiceContentErrorSet = false;
                    boolean voiceDescriptionErrorSet = false;
                    for (AudioForm audioForm : (List<AudioForm>) parser
                            .parseExpression(
                                    "voiceMessageForm.audioForms.?[description.length() > 8000]")
                            .getValue(this)) {
                        if (audioForm.getAddAudioBy().equals(
                                AudioForm.AddBy.TTS)
                                && !voiceContentErrorSet) {
                            voiceContentErrorSet = true;
                            bindingResult.rejectValue(
                                    "voiceMessageForm.audioForms",
                                    "message.voice.content.exceed.limit");
                        } else {
                            if (!voiceDescriptionErrorSet) {
                                voiceDescriptionErrorSet = false;
                                bindingResult
                                        .rejectValue(
                                                "voiceMessageForm.audioForms",
                                                "message.describe.voice.content.exceed.limit");
                            }
                        }
                        validate = false;
                    }
                break;
            default:
                throw new IllegalStateException("Unsupported channel: "
                        + channel);
            }
        }
        return validate;
    }
}
