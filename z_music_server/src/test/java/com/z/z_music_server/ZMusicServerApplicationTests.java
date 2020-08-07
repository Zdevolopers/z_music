//package com.z.z_music_server;
//
//import cn.hutool.core.util.CharsetUtil;
//import cn.hutool.core.util.HexUtil;
//import cn.hutool.crypto.SecureUtil;
//import cn.hutool.crypto.symmetric.AES;
//import cn.hutool.crypto.symmetric.DES;
//import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
//import org.apache.catalina.security.SecurityUtil;
//import org.junit.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.crypto.SecretKey;
//import java.io.UnsupportedEncodingException;
//
//@SpringBootTest
//class ZMusicServerApplicationTests {
//
//    @Test
//    void contextLoads() {
//    }
//
//
//    public static void main(String[] args) throws UnsupportedEncodingException {
//        String str = "asdipufhsapoijfs";
//        String hexStr = HexUtil.encodeHexStr(str);
//        DES des = SecureUtil.des(hexStr.getBytes());
//        byte[] encrypt = des.encrypt(hexStr);
//        String encode = new String(encrypt);
//        System.out.println("Hex加密之后的数据库密码为:" + encode);
//        AES aes = SecureUtil.aes(encrypt);
//        System.out.println("Hex解密之后的数据库密码为:" + aes.decryptStr(encode));
//
////        String secert = HexUtil.decodeHexStr(aesSerect);
////        System.out.println("Hex解密之后的数据库密码为:" + secert);
//
//    }
//
//}
