package test.service.impl;

import org.springframework.stereotype.Service;
import test.domain.*;
import test.mapper.*;
import test.service.IAdminService;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by libin on 2017/10/28.
 */
@Service("adminService")
public class AdminService implements IAdminService {
    @Resource
    InformationBasicMapper informationBasicMapper;
    @Resource
    InformationPoliticsMapper informationPoliticsMapper;
    @Resource
    InformationContactMapper informationContactMapper;
    @Resource
    InformationOriginalMapper informationOriginalMapper;
    @Resource
    InformationSupplementMapper informationSupplementMapper;
    @Resource
    InformationPresentMapper informationPresentMapper;


    @Override
    public List<String> getCTitles(String[] informationBasic, String[] informationPolitics, String[] informationOriginal, String[] informationPresent, String[] informationContact, String[] informationSupplement) {
        List<String> titles = new ArrayList<String>();
        titles.add("身份证号");
        if (informationBasic != null)
            titles.addAll(Arrays.asList(informationBasic));
        if (informationPolitics != null)
            titles.addAll(Arrays.asList(informationPolitics));
        if (informationOriginal != null)
            titles.addAll(Arrays.asList(informationOriginal));
        if (informationPresent != null)
            titles.addAll(Arrays.asList(informationPresent));
        if (informationContact != null)
            titles.addAll(Arrays.asList(informationContact));
        if (informationSupplement != null)
            titles.addAll(Arrays.asList(informationSupplement));
        return titles;
    }

    @Override
    public List<List<String>> getETitles(String[] informationBasic, String[] informationPolitics, String[] informationOriginal, String[] informationPresent, String[] informationContact, String[] informationSupplement) {
        List<List<String>> titles = new ArrayList<List<String>>();
        List<String> titles1 = new ArrayList<String>();
        List<String> titles2 = new ArrayList<String>();
        List<String> titles3 = new ArrayList<String>();
        List<String> titles4 = new ArrayList<String>();
        List<String> titles5 = new ArrayList<String>();
        List<String> titles6 = new ArrayList<String>();
        for (int i = 0; i < 6; i++) {
            titles.add(null);
        }

        if (informationBasic != null) {
            titles1.addAll(Arrays.asList(informationBasic));
            titles.set(0, titles1);
        }
        if (informationPolitics != null) {
            titles2.addAll(Arrays.asList(informationPolitics));
            titles.set(1, titles2);
        }

        if (informationOriginal != null) {
            titles3.addAll(Arrays.asList(informationOriginal));
            titles.set(2, titles3);
        }
        if (informationPresent != null) {
            titles4.addAll(Arrays.asList(informationPresent));
            titles.set(3, titles4);
        }
        if (informationContact != null) {
            titles5.addAll(Arrays.asList(informationContact));
            titles.set(4, titles5);
        }
        if (informationSupplement != null) {
            titles6.addAll(Arrays.asList(informationSupplement));
            titles.set(5, titles6);
        }
        return titles;
    }

    @Override
    public void addSave(List<List<String>> titles, List<String> record) {
        int index = 0;
        int length = 0;
        Integer id = new Integer(0);
        for (List<String> title : titles) {
            if (title == null) {
                index++;
                System.out.println(index);
                continue;
            }
            String classname = new String();
            switch (index) {
                case 0: {
                    classname = "test.domain.InformationBasic";
                    break;
                }
                case 1: {
                    classname = "test.domain.InformationPolitics";
                    break;
                }
                case 2: {
                    classname = "test.domain.InformationOriginal";
                    break;
                }
                case 3: {
                    classname = "test.domain.InformationPresent";
                    break;
                }
                case 4: {
                    classname = "test.domain.InformationContact";
                    break;
                }
                case 5: {
                    classname = "test.domain.InformationSupplement";
                    break;
                }
            }
            System.out.println(index);
            try {
                Class clazz = Class.forName(classname);
                Object taget = clazz.newInstance();
                for (String filed : title) {
                    //构造set方法
                    String methodname = "set" + filed.substring(0, 1).toUpperCase() + filed.substring(1);
                    System.out.println(classname);
                    System.out.println(methodname);
                    System.out.println(record.get(length));
                    Field f = clazz.getDeclaredField(filed);
                    Method method = clazz.getMethod(methodname, f.getType());
                    if (f.getType() == String.class) {
                        method.invoke(taget, record.get(length));
                    } else if (f.getType() == Integer.class) {
                        method.invoke(taget, new Integer(record.get(length)));
                    } else if (f.getType() == Date.class) {

                        if (record.get(length) == null) ;
                        else {
                            DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                            method.invoke(taget, date.parse(record.get(length)));
                        }
                    }
                    length++;
                }
                switch (index) {
                    case 0: {
                        informationBasicMapper.insert((InformationBasic) taget);
                        InformationBasicExample example = new InformationBasicExample();
                        InformationBasicExample.Criteria criteria = example.createCriteria();
                        criteria.andIdNumberEqualTo(((InformationBasic) taget).getIdNumber());
                        InformationBasic informationBasic1 = informationBasicMapper.selectByExample(example).get(0);
                        id = informationBasic1.getId();
                        break;
                    }
                    case 1: {
                        ((InformationPolitics) taget).setId(id);
                        informationPoliticsMapper.insert((InformationPolitics) taget);
                        break;
                    }
                    case 2: {
                        ((InformationOriginal) taget).setId(id);
                        informationOriginalMapper.insert((InformationOriginal) taget);
                        break;
                    }
                    case 3: {
                        ((InformationPresent) taget).setId(id);
                        informationPresentMapper.insert((InformationPresent) taget);
                        break;
                    }
                    case 4: {
                        ((InformationContact) taget).setId(id);
                        informationContactMapper.insert((InformationContact) taget);
                        break;
                    }
                    case 5: {
                        ((InformationSupplement) taget).setId(id);
                        informationSupplementMapper.insert((InformationSupplement) taget);
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                index++;
            }
        }
    }

    @Override
    public void coverSave(List<List<String>> titles, List<String> record) {
        //方法记录
        int index = 0;
        //字段位置记录
        int length = 0;
        //主键记录
        Integer id = new Integer(0);
        for (List<String> title : titles) {
            if (title == null) {
                index++;
                System.out.println(index);
                continue;
            }
            String classname = new String();
            switch (index) {
                case 0: {
                    classname = "test.domain.InformationBasic";
                    break;
                }
                case 1: {
                    classname = "test.domain.InformationPolitics";
                    break;
                }
                case 2: {
                    classname = "test.domain.InformationOriginal";
                    break;
                }
                case 3: {
                    classname = "test.domain.InformationPresent";
                    break;
                }
                case 4: {
                    classname = "test.domain.InformationContact";
                    break;
                }
                case 5: {
                    classname = "test.domain.InformationSupplement";
                    break;
                }
            }
            System.out.println(index);
            try {
                Class clazz = Class.forName(classname);
                Object taget = clazz.newInstance();
                for (String filed : title) {
                    //构造set方法
                    String methodname = "set" + filed.substring(0, 1).toUpperCase() + filed.substring(1);
                    System.out.println(classname);
                    System.out.println(methodname);
                    System.out.println(record.get(length));
                    Field f = clazz.getDeclaredField(filed);
                    Method method = clazz.getMethod(methodname, f.getType());
                    if (f.getType() == String.class) {
                        method.invoke(taget, record.get(length));
                    } else if (f.getType() == Integer.class) {
                        method.invoke(taget, new Integer(record.get(length)));
                    } else if (f.getType() == Date.class) {
                        if (record.get(length) == null) ;
                        else {
                            DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                            method.invoke(taget, date.parse(record.get(length)));
                        }
                    }
                    length++;
                }
                switch (index) {
                    case 0: {
                        InformationBasicExample example = new InformationBasicExample();
                        InformationBasicExample.Criteria criteria = example.createCriteria();
                        criteria.andIdNumberEqualTo(((InformationBasic) taget).getIdNumber());
                        List<InformationBasic> t = informationBasicMapper.selectByExample(example);
                        if (t.size() > 0) {
                            InformationBasic informationBasic1 = t.get(0);
                            informationBasicMapper.deleteByPrimaryKey(informationBasic1.getId());
                            informationPoliticsMapper.deleteByPrimaryKey(informationBasic1.getId());
                            informationOriginalMapper.deleteByPrimaryKey(informationBasic1.getId());
                            informationPresentMapper.deleteByPrimaryKey(informationBasic1.getId());
                            informationContactMapper.deleteByPrimaryKey(informationBasic1.getId());
                            informationSupplementMapper.deleteByPrimaryKey(informationBasic1.getId());
                            ((InformationBasic) taget).setId(informationBasic1.getId());
                            informationBasicMapper.insert((InformationBasic) taget);
                            id = informationBasic1.getId();
                        } else {
                            informationBasicMapper.insert((InformationBasic) taget);
                            InformationBasicExample example1 = new InformationBasicExample();
                            InformationBasicExample.Criteria criteria1 = example.createCriteria();
                            criteria1.andIdNumberEqualTo(((InformationBasic) taget).getIdNumber());
                            InformationBasic informationBasic = informationBasicMapper.selectByExample(example1).get(0);
                            id = informationBasic.getId();
                        }

                        break;
                    }
                    case 1: {
                        ((InformationPolitics) taget).setId(id);

                        informationPoliticsMapper.insert((InformationPolitics) taget);
                        break;
                    }
                    case 2: {
                        ((InformationOriginal) taget).setId(id);
                        informationOriginalMapper.insert((InformationOriginal) taget);
                        break;
                    }
                    case 3: {
                        ((InformationPresent) taget).setId(id);
                        informationPresentMapper.insert((InformationPresent) taget);
                        break;
                    }
                    case 4: {
                        ((InformationContact) taget).setId(id);
                        informationContactMapper.insert((InformationContact) taget);
                        break;
                    }
                    case 5: {
                        ((InformationSupplement) taget).setId(id);
                        informationSupplementMapper.insert((InformationSupplement) taget);
                        break;
                    }
                }
                index++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateSave(List<List<String>> titles, List<String> record) {
        int index = 0;
        int length = 0;
        Integer id = new Integer(0);
        for (List<String> title : titles) {
            if (title == null) {
                index++;
                System.out.println(index);
                continue;
            }
            String classname = new String();
            switch (index) {
                case 0: {
                    classname = "test.domain.InformationBasic";
                    break;
                }
                case 1: {
                    classname = "test.domain.InformationPolitics";
                    break;
                }
                case 2: {
                    classname = "test.domain.InformationOriginal";
                    break;
                }
                case 3: {
                    classname = "test.domain.InformationPresent";
                    break;
                }
                case 4: {
                    classname = "test.domain.InformationContact";
                    break;
                }
                case 5: {
                    classname = "test.domain.InformationSupplement";
                    break;
                }
            }
            System.out.println(index);
            try {
                Class clazz = Class.forName(classname);
                Object taget = clazz.newInstance();
                for (String filed : title) {
                    //构造set方法
                    String methodname = "set" + filed.substring(0, 1).toUpperCase() + filed.substring(1);
                    Field f = clazz.getDeclaredField(filed);
                    Method method = clazz.getMethod(methodname, f.getType());
                    if (f.getType() == String.class) {
                        method.invoke(taget, record.get(length));
                    } else if (f.getType() == Integer.class) {
                        method.invoke(taget, new Integer(record.get(length)));
                    } else if (f.getType() == Date.class) {
                        if (record.get(length) == null) ;
                        else {
                            DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                            method.invoke(taget, date.parse(record.get(length)));
                        }
                    }
                    length++;
                }
                switch (index) {
                    case 0: {
                        //根据idNumber查找已存在数据
                        InformationBasicExample example = new InformationBasicExample();
                        InformationBasicExample.Criteria criteria = example.createCriteria();
                        criteria.andIdNumberEqualTo(((InformationBasic) taget).getIdNumber());
                        InformationBasic informationBasic1 = informationBasicMapper.selectByExample(example).get(0);
                        ((InformationBasic) taget).setId(informationBasic1.getId());
                        informationBasicMapper.updateByPrimaryKeySelective((InformationBasic) taget);
                        id = informationBasic1.getId();
                        break;
                    }
                    case 1: {
                        ((InformationPolitics) taget).setId(id);
                        informationPoliticsMapper.updateByPrimaryKeySelective((InformationPolitics) taget);
                        break;
                    }
                    case 2: {
                        ((InformationOriginal) taget).setId(id);
                        informationOriginalMapper.updateByPrimaryKeySelective((InformationOriginal) taget);
                        break;
                    }
                    case 3: {
                        ((InformationPresent) taget).setId(id);
                        informationPresentMapper.updateByPrimaryKeySelective((InformationPresent) taget);
                        break;
                    }
                    case 4: {
                        ((InformationContact) taget).setId(id);
                        informationContactMapper.updateByPrimaryKeySelective((InformationContact) taget);
                        break;
                    }
                    case 5: {
                        ((InformationSupplement) taget).setId(id);
                        informationSupplementMapper.updateByPrimaryKeySelective((InformationSupplement) taget);
                        break;
                    }
                }
                index++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void insertOrUpdateSave(List<List<String>> titles, List<String> record) {
        //方法记录
        int index = 0;
        //字段位置记录
        int length = 0;
        //主键记录
        Integer id = new Integer(0);
        //记录是否存在标志
        int flag = 0;
        //空字段标志
        int nullflag = 0;
        for (List<String> title : titles) {
            nullflag = 0;
            if (title == null) {
                index++;
                System.out.println(index);
                continue;
            }
            String classname = new String();
            switch (index) {
                case 0: {
                    classname = "test.domain.InformationBasic";
                    break;
                }
                case 1: {
                    classname = "test.domain.InformationPolitics";
                    break;
                }
                case 2: {
                    classname = "test.domain.InformationOriginal";
                    break;
                }
                case 3: {
                    classname = "test.domain.InformationPresent";
                    break;
                }
                case 4: {
                    classname = "test.domain.InformationContact";
                    break;
                }
                case 5: {
                    classname = "test.domain.InformationSupplement";
                    break;
                }
            }
            System.out.println(index);
            try {
                Class clazz = Class.forName(classname);
                Object taget = clazz.newInstance();
                for (String filed : title) {
                    //构造set方法
                    String methodname = "set" + filed.substring(0, 1).toUpperCase() + filed.substring(1);
                    Field f = clazz.getDeclaredField(filed);

                    Method method = clazz.getMethod(methodname, f.getType());
                    if (f.getType() == String.class) {
                        if (record.get(length) == null) nullflag++;
                        else
                            method.invoke(taget, record.get(length));
                    } else if (f.getType() == Integer.class) {
                        if (record.get(length) == null) nullflag++;
                        else
                            method.invoke(taget, new Integer(record.get(length)));
                    } else if (f.getType() == Date.class) {
                        if (record.get(length) == null) nullflag++;
                        else {
                            DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                            method.invoke(taget, date.parse(record.get(length)));
                        }
                    }
                    length++;
                }
                if (clazz.getDeclaredFields().length - 1 == nullflag) {
                    index++;
                    continue;
                }
                switch (index) {
                    case 0: {
                        //根据idNumber查找已存在数据
                        InformationBasicExample example = new InformationBasicExample();
                        InformationBasicExample.Criteria criteria = example.createCriteria();
                        criteria.andIdNumberEqualTo(((InformationBasic) taget).getIdNumber());
                        if (informationBasicMapper.selectByExample(example).size() > 0) {
                            InformationBasic informationBasic = informationBasicMapper.selectByExample(example).get(0);
                            ((InformationBasic) taget).setId(informationBasic.getId());
                            informationBasicMapper.updateByPrimaryKeySelective((InformationBasic) taget);
                            id = informationBasic.getId();
                            flag = 1;
                        } else {
                            informationBasicMapper.insert((InformationBasic) taget);
                            InformationBasicExample example1 = new InformationBasicExample();
                            InformationBasicExample.Criteria criteria1 = example.createCriteria();
                            criteria1.andIdNumberEqualTo(((InformationBasic) taget).getIdNumber());
                            InformationBasic informationBasic = informationBasicMapper.selectByExample(example1).get(0);
                            id = informationBasic.getId();
                        }
                        break;
                    }
                    case 1: {
                        ((InformationPolitics) taget).setId(id);
                        if (flag == 1)
                            informationPoliticsMapper.updateByPrimaryKeySelective((InformationPolitics) taget);
                        else informationPoliticsMapper.insert((InformationPolitics) taget);
                        break;
                    }
                    case 2: {
                        ((InformationOriginal) taget).setId(id);
                        System.out.println(((InformationOriginal) taget).getId() + "   " + ((InformationOriginal) taget).getTimeRetirement() + "    " + ((InformationOriginal) taget).getOrginDutiesLevel());
                        if (flag == 1)
                            informationOriginalMapper.updateByPrimaryKeySelective((InformationOriginal) taget);
                        else informationOriginalMapper.insert((InformationOriginal) taget);
                        break;
                    }
                    case 3: {
                        ((InformationPresent) taget).setId(id);
                        if (flag == 1)
                            informationPresentMapper.updateByPrimaryKeySelective((InformationPresent) taget);
                        else informationPresentMapper.insert((InformationPresent) taget);
                        break;
                    }
                    case 4: {
                        ((InformationContact) taget).setId(id);
                        if (flag == 1)
                            informationContactMapper.updateByPrimaryKeySelective((InformationContact) taget);
                        else informationContactMapper.insert((InformationContact) taget);
                        break;
                    }
                    case 5: {
                        InformationSupplement in = ((InformationSupplement) taget);
                        in.setId(id);
                        if (flag == 1)
                            informationSupplementMapper.updateByPrimaryKeySelective((InformationSupplement) taget);
                        else informationSupplementMapper.insert((InformationSupplement) taget);
                        break;
                    }
                }
                index++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
