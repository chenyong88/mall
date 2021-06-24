package com.macro.mall.portal.util.ali;

import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.teaopenapi.models.Config;

/**
 * @author chenyong
 */

public   class  AliSmsUtil {

    private    static  final   String  accessKeyId = "LTAI4FbbVkmZCHcWTcRHHqXv";

    private    static  final  String accessKeySecret = "O2OBu0CBS9tZ89jU2nHbSEWdv2m6py";

    private    static  final  String  endpoint = "dysmsapi.aliyuncs.com";

    private    static  final  String  signName = "精购";

    private    static   final   String  SEND_OK = "OK";

        /**
         * 使用AK&SK初始化账号Client
         * @param accessKeyId
         * @param accessKeySecret
         * @return Client
         * @throws Exception
         */
        public static com.aliyun.dysmsapi20170525.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
            Config config = new Config()
                    // 您的AccessKey ID
                    .setAccessKeyId(accessKeyId)
                    // 您的AccessKey Secret
                    .setAccessKeySecret(accessKeySecret);
            // 访问的域名
            config.endpoint = "dysmsapi.aliyuncs.com";
            return new com.aliyun.dysmsapi20170525.Client(config);
        }

        public  static  boolean  sendSms(String telphone,String  code,String  templateCode,String signName){
            boolean isSend = false ;
            try {
                com.aliyun.dysmsapi20170525.Client client  = AliSmsUtil.createClient(accessKeyId, accessKeySecret);
                SendSmsRequest sendSmsRequest = new SendSmsRequest()
                        .setPhoneNumbers(telphone)
                        .setSignName("精购")
                        .setTemplateCode(templateCode)
                        .setTemplateParam(code);
                SendSmsResponse smsResponse =  client.sendSms(sendSmsRequest);
                if( smsResponse.body.getCode().equals(SEND_OK)){
                    isSend = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
          return  isSend ;
        }


    public static void main(String[] args) throws Exception {
        com.aliyun.dysmsapi20170525.Client client =
                AliSmsUtil.createClient("accessKeyId", "accessKeySecret");
        SendSmsRequest sendSmsRequest = new SendSmsRequest()
                .setPhoneNumbers("13790312632")
                .setSignName("精购")
                .setTemplateCode("SMS_178540270")
                .setTemplateParam("{\"code\":\"234568\"}");
        client.sendSms(sendSmsRequest);
    }





}
