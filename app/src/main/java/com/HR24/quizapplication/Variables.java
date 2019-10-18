package com.HR24.quizapplication;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Variables {

    public static int rightAnswer;


    static   HashMap<Integer, String> numsRU = new LinkedHashMap<Integer, String>(){{
        put(1, "一 [yī] и");
        put(2, "二 [èr] эр");
        put(3, "三 [sān] сань");
        put(4, "四 [sì] сы");
        put(5, "五 [wǔ] у");
        put(6, "六 [liù] лиу");
        put(7, "七 [qī] тси");
        put(8, "八 [bā] ба");
        put(9, "九 [jiǔ] цзиу");
        put(10, "十 [shí] ши");
        put(11 , "十一 [shí yī] ши и");
        put(12 , "十二 [shí èr] ши эр");
        put(20 , "二十 [èr shí] эр ши");
        put(30 , " 三十 [sān shí] сань ши");
        put(40 , "四十 [sì shí] сы ши");
        put(50 , "五十 [wǔ shí] у ши");
        put(51 , "五十一 [wǔ shí yī] у ши и");
        put(52 , " 五十二 [wǔ shí èr] у ши эр");
        put(53 , "五十三 [wǔ shí sān] у ши сань");
        put(100 , "十 [shí] ши");
        put(200  , "二百 [èr bǎi] эр бай");
        put(1000 , " 一千 [yī qiān] и тсиень");
        put(10000 , "一万 [yī wàn] и вань");
        put(1000000 , "一百万 [yī bǎi wàn] и бай вань");
    }};
    static   HashMap<Integer, String> numsEN = new LinkedHashMap<Integer, String>(){{
        put(1, "一 [yī]");
        put(2, "二 [èr]");
        put(3, "三 [sān]");
        put(4, "四 [sì]");
        put(5, "五 [wǔ]");
        put(6, "六 [liù]");
        put(7, "七 [qī]");
        put(8, "八 [bā]");
        put(9, "九 [jiǔ]");
        put(10, "十 [shí]");
        put(11 , "十一 [shí yī]");
        put(12 , "十二 [shí èr]");
        put(20 , "二十 [èr shí");
        put(30 , " 三十 [sān shí]");
        put(40 , "四十 [sì shí]");
        put(50 , "五十 [wǔ shí]");
        put(51 , "五十一 [wǔ shí yī]");
        put(52 , " 五十二 [wǔ shí èr]");
        put(53 , "五十三 [wǔ shí sān]");
        put(100 , "十 [shí]");
        put(200  , "二百 [èr bǎi]");
        put(1000 , " 一千 [yī qiān]");
        put(10000 , "一万 [yī wàn]");
        put(1000000 , "一百万 [yī bǎi wàn]");
    }};

    static String [] keysRU = {
            "Здравствуйте!",
            "До свидания!",
            "Да",
            "Нет",
            "Добро пожаловать!",
            "Спасибо!",
            "Пожалуйста!",
            "Извините!",
            "Мне неловко",
            "Ничего страшного",
            "Молодец",
            "Хорошо/плохо",
            "Можно/нельзя",
            "Как дела?",
            "Как ты?",
            "Пожалуйста, садитесь (присаживайтесь)",
            "Скажите, пожалуйста, где туалет?",
            "Где можно купить телефонную карточку?",
            "Где можно поймать такси?",
            "Пожалуйста, сфотографируйте нас",
            "Я не понимаю",
            "Принесите, пожалуйста, меню",
            "Я хочу заказать это … это… и это. (показывая в меню)",
            "Сколько стоит?",
            "Повторите, пожалуйста, что вы сказали",
            "Вы говорите по-русски?",
            "Здесь кто-нибудь говорит по-русски?",
            "Вы говорите по-английски?",
            "Здесь кто-нибудь говорит по-английски?",
            "Вы очень красивая!",
            "Счастливого пути!",
            "Спокойной ночи! ",
            "Не надо",
            "Спасибо, не надо",
            "До свидания"

    };

    static String [] keysEN = {
            "Hello!",
            "Goodbye!",
            "Yes",
            "No",
            "Welcome!",
            "Thanks!",
            "Please!",
            "Sorry!",
            "I feel awkward",
            "Nothing wrong",
            "Well done",
            "Good/Bad",
            "Possible / not",
            "How are you?",
            "How do you?",
            "Please take a seat",
            "Please tell me where is the toilet?",
            "Where can I buy a phone card?",
            "Где можно поймать такси?",
            "Where can I get a taxi?",
            "I do not understand",
            "Please bring the menu",
            "I want to order this ... this ... and this. (showing in the menu)",
            "How much is it",
            "Please repeat what you said",
            "Do you speak Russian?",
            "Is anyone here speaking Russian?",
            "Do you speak English?",
            "Is anyone here speaking English?",
            "You are very beautiful!",
            "Have a good trip!",
            "Good night!",
            "Do not",
            "No, thanks",
            "Goodbye"

    };

    static String[] valuesRU = new String[]
            {
                    "你好！[nǐ hǎo] Нихао!",
                    " [zài jiàn] Цзайцзиень!",
                    "是[shì] Ши",
                    "不是 [bù shì] Бу ши",
                    "欢迎！ [huānyíng] Хуаньин!",
                    "谢谢！[xiè xie] Сесе!",
                    "不客气！ [bù kě qi] Букэтси!",
                    " 对不起！[duìbuqǐ] Дуйбутси!",
                    "不好意思！ [bùhǎoyìsi] Бухаоисы",
                    "没关系。[méi guānxi] Мэйгуаньси",
                    "厉害！ [lìhài] Лихай",
                    "好/不好 [hǎo] [bùhǎo] Хао/бухао",
                    "可以/不可以 [kě yǐ] [bù kě yǐ] Кхэи/бу кхэи",
                    "你好吗？ [nǐ hǎo ma] Ни хао ма?",
                    "你怎么样？ [nǐ zěnme yàng] Ни цзэньмэ ян?",
                    "请坐。 [qǐng zuò] Тсин цзуо",
                    "胃口好！[wèikǒu hǎo] Вэйкхоу хао!",
                    "请问，厕所在哪里？[qǐng wèn, cèsuǒ zài nǎli] Тсинвэнь, цхэсуо цзай нали?",
                    "在哪儿可以买到电话卡？ [zài nǎr kěyǐ mǎidào diànhuàkǎ] Цзайнар кхэи майдао диеньхуа кха?",
                    "在哪儿可以租车？ [zài nǎr kěyǐ zū chē] Цзайнар кхэи цзучхэ?",
                    "请给我们拍一照。[qǐng gěi wǒmen pāi yīzhào] Тсин гэй вомэнь пхай и джао.",
                    "我不明白。[wǒ bù míngbái] Во бу минбай.",
                    "请给我菜谱。 [qǐng gěi wǒ càipǔ] Тсин гэй во цхайпху.",
                    "我要这个… 这个…和这个…。[wǒ yāo zhège… zhège…hé zhège] Во яо джэгэ… джэгэ… хэ джэгэ",
                    "多少钱？ [duō shǎo qián] Туо шао тсиень?",
                    "请您再说一遍 [qǐng nín zài shuō yī biàn] Тсин нинь цзай шуо и биень.",
                    "你会说俄语吗? [nǐ huì shuō èyǔ ma] Ни хуй шо эюй ма?",
                    "这里有人会说俄语吗？ [zhè li yǒurén huì shuō èyǔ ma] Чжэли ёужень хуйшо эюй ма?",
                    "你会说英语吗？[nǐ huì shuō yīngyǔ ma] Ни хуй шо инюй ма?",
                    "这里有人会说英语吗？[zhè li yǒurén huì shuō yīngyǔ ma] Чжэли ёужень хуйшо инюй ма?",
                    "你很漂亮！ [nǐ hěn piàoliang] Ни хэнь пхяолян!",
                    "一路平安! [yīlù píng’ān!] И лу пхин ан!",
                    "晚安！ [wǎn’ān!] Вань ань!",
                    "不要。 [bú yào] Бу яо.",
                    "谢谢, 不要。 [xiè xie, bú yào] Сесе, бу яо",
                    "再见。 [zài jiàn] Цзай цьен"
            };
    static String[] valuesEN = new String[]
            {
                    "你好！[nǐ hǎo] ",
                    " [zài jiàn] ",
                    "是[shì]",
                    "不是 [bù shì]",
                    "欢迎！ [huānyíng]",
                    "谢谢！[xiè xie]",
                    "不客气！ [bù kě qi]",
                    " 对不起！[duìbuqǐ]",
                    "不好意思！ [bùhǎoyìsi]",
                    "没关系。[méi guānxi]",
                    "厉害！ [lìhài]",
                    "好/不好 [hǎo] [bùhǎo]",
                    "可以/不可以 [kě yǐ] [bù kě yǐ]",
                    "你好吗？ [nǐ hǎo ma] ",
                    "你怎么样？ [nǐ zěnme yàng]",
                    "请坐。 [qǐng zuò]",
                    "胃口好！[wèikǒu hǎo]",
                    "请问，厕所在哪里？[qǐng wèn, cèsuǒ zài nǎli]",
                    "在哪儿可以买到电话卡？ [zài nǎr kěyǐ mǎidào diànhuàkǎ]",
                    "在哪儿可以租车？ [zài nǎr kěyǐ zū chē]",
                    "请给我们拍一照。[qǐng gěi wǒmen pāi yīzhào]",
                    "我不明白。[wǒ bù míngbái]",
                    "请给我菜谱。 [qǐng gěi wǒ càipǔ]",
                    "我要这个… 这个…和这个…。[wǒ yāo zhège… zhège…hé zhège]",
                    "多少钱？ [duō shǎo qián]",
                    "请您再说一遍 [qǐng nín zài shuō yī biàn]",
                    "你会说俄语吗? [nǐ huì shuō èyǔ ma]",
                    "这里有人会说俄语吗？ [zhè li yǒurén huì shuō èyǔ ma]",
                    "你会说英语吗？[nǐ huì shuō yīngyǔ ma]",
                    "这里有人会说英语吗？[zhè li yǒurén huì shuō yīngyǔ ma]",
                    "你很漂亮！ [nǐ hěn piàoliang]",
                    "一路平安! [yīlù píng’ān!]",
                    "晚安！ [wǎn’ān!]",
                    "不要。 [bú yào]",
                    "谢谢, 不要。 [xiè xie, bú yào]",
                    "再见。 [zài jiàn]"
            };


}
