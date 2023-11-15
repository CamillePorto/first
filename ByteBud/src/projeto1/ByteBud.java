package projeto1;

public class ByteBud {
    private String topic;

    public ByteBud(String topic) {
        this.topic = topic;
    }

    public String askQuestion() {
        return "What do you think about " + topic + "?";
    }

    public String respondToUser(String userResponse) {
        // Here we will implement the logic to respond to the user's input
       if (userResponse.contains("love") || userResponse.contains("like")) {
    return "I'm glad you like " + topic + "! Can you tell me more about what you like about it?";
    } else if (userResponse.contains("hate") || userResponse.contains("dislike")) {
        return "I'm sorry to hear that you don't like " + topic + ". Can you tell me why?";
    } else {
        return "That's interesting. Can you tell me more about your thoughts on " + topic + "?";
    }
    }

    public void changeTopic(String newTopic) {
        this.topic = newTopic;
    }
}