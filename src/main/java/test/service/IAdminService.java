package test.service;

import test.domain.AdminLogin;
import test.domain.InformationAll;
import test.domain.MemberLogin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by libin on 2017/10/28.
 */
public interface IAdminService {
    List<String> getCTitles(String [] informationBasic,String [] informationPolitics,String [] informationOriginal,String [] informationPresent,String [] informationContact,String [] informationSupplement);
     List<List<String>> getETitles(String[] informationBasic, String[] informationPolitics, String[] informationOriginal, String[] informationPresent, String[] informationContact, String[] informationSupplement);
     void addSave( List<List<String>> titles,List<String> record);
     void coverSave( List<List<String>> titles,List<String> record);
     void updateSave( List<List<String>> titles,List<String> record);
     void insertOrUpdateSave( List<List<String>> titles,List<String> record);
     String saveByall(InformationAll informationAll);
     String updateByall(InformationAll informationAll);
     String deleteById(int id);
     void updateAlld();
     List<AdminLogin> getAdminUser();
     List<MemberLogin> getMemberUser();
     boolean initPWD(String name,String PWD);
}
