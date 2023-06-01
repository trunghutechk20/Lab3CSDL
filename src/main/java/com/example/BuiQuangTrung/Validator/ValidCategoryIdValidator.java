package com.example.BuiQuangTrung.Validator;


import com.example.BuiQuangTrung.Validator.annotation.ValidCategoryId;
import com.example.BuiQuangTrung.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() !=null;
    }
}
