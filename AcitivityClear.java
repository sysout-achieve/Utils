public static void mainIntentAction(Activity nowActivity, Class goToActivity){
        Intent intent_main = new Intent(nowActivity, goToActivity);
        intent_main.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent_main.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        nowActivity.startActivity(intent_main);
    }
